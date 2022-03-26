package com.linefood.bot.flex;

import com.linecorp.bot.model.action.URIAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.flex.component.*;
import com.linecorp.bot.model.message.flex.component.Button.ButtonHeight;
import com.linecorp.bot.model.message.flex.component.Image.ImageAspectMode;
import com.linecorp.bot.model.message.flex.component.Image.ImageAspectRatio;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;
import com.linecorp.bot.model.message.flex.unit.FlexMarginSize;

public class Food2Pv2 implements Supplier<FlexMessage> {
    public class Food2Pv1 implements Supplier<FlexMessage> {
        public FlexMessage get() {
            final Image heroBlock = createHeroBlock();
            final Box bodyBlock = createBodyBlock();
            final Box footerBlock = createFooterBlock();
    
            final Bubble bubbleContainer = Bubble.builder()
                    .hero(heroBlock)
                    .body(bodyBlock)
                    .footer(footerBlock)
                    .build();
            return new FlexMessage("Restaurant", bubbleContainer);
        }
    
        private Image createHeroBlock() {
            return Image.builder()
                    .url("http://4.bp.blogspot.com/-pYAJG0U_hGg/Vh3Q3FbBFcI/AAAAAAAAAFI/Mi1OMOimPM8/s1600/img_1381_resize.jpg")
                    .size(Image.ImageSize.FULL_WIDTH)
                    .aspectRatio(ImageAspectRatio.R20TO13)
                    .aspectMode(ImageAspectMode.Cover)
                    .action(new URIAction("label", "http://example.com"))
                    .build();
        }
    
        private Box createBodyBlock() {
            final Text title = Text.builder()
                    .text("วิธีทำข้าวซอยน้อย")
                    .weight(Text.TextWeight.BOLD)
                    .size(FlexFontSize.XL)
                    .build();
            
            final Box info = createInfoBox();
    
            return Box.builder()
                    .layout(FlexLayout.VERTICAL)
                    .contents(asList(title,info))
                    .build();
        }
    
        private Box createInfoBox() {
            final Box place = Box.builder()
                    .layout(FlexLayout.BASELINE)
                    .spacing(FlexMarginSize.SM)
                    .contents(asList(
                            Text.builder()
                                .text("ส่วนผสมสำหรับทำแป้ง\n1. ข้าวเจ้าโม่ละเอียด 1 กก.\n2. หัวข้าวเจ้า\nส่วนผสมสำหรับทำไส้\n1. หมูบด\n2. ถั่วเน่า\n3. พริกแห้ง\n4. มะเขือเทศ\n5. ต้นหอมผักชี\n6. พริกไทย\n7. เกลือ\n8. น้ำมันพืช\n9. กระเทียม\nวิธีทำแป้ง\n1. เคี่ยวหัวแป้งให้สุก พักไว้ให้เย็น\n2. นำหัวแป้ง 1 ทัพพีใหญ่ มีผสมกับแป้งข้าวเจ้าที่โม่ไว้ อัตราส่วน 1ทัพพี ต่อ 1 กิโลกรัม คนให้เข้ากันวิธีทำไส้\n1. ตำพริกแห้ง ถั่วเน่า กระเทียม เกลือ ให้ละเอียด\n2. นำพริกที่ตำไว้มาผัดให้หอม ใส่เนื้อหมูลงไปผัดให้สุก ชิมและปรุงรสตามชอบ เน้นเผ็ดเค็มนิดๆ\nวิธีทำข้าวซอยน้อย\n1. ใช้หม้อใบใหญ่ๆ ใส่น้ำครึ่งหม้อตั้งน้ำให้เดือด\n2. ทาน้ำมันลงในถาดแล้วใส่แป้งที่ลงไปเกลี่ยบางๆ\n3. นำถาดที่ใส่แป้งลงไปวางในหม้อแล้วปิดฝาหม้อ ทิ้งไว้ประมาณ 30 วินาที ยกขึ้นมา\n4. ใส่ไส้ที่เตรียมไว้ เกลี่ยให้ทั่วแผ่น โรยต้นหอมผักชี พริกไทย\n5. ห่อคล้ายๆกับก๋วยเตี๋ยวหลอด\n6. ทานขณะที่ยังร้อน คู่กับผักต่างๆ\n")
                                .wrap(true)
                                .color("#666666")
                                .flex(5)
                                .build()
                    )).build();
            
            return Box.builder()
                    .layout(FlexLayout.VERTICAL)
                    .margin(FlexMarginSize.LG)
                    .spacing(FlexMarginSize.SM)
                    .contents(asList(place))
                    .build();
        }
    
    
        private Box createFooterBlock() {
            final Spacer spacer = Spacer.builder().size(FlexMarginSize.SM).build();
            final Separator separator = Separator.builder().build();
            final Button websiteAction = Button.builder()
                    .style(Button.ButtonStyle.LINK)
                    .height(ButtonHeight.SMALL)
                    .action(new URIAction("WEBSITE", "https://guide.michelin.com/th/th/article/features/10-northern-thai-dishes-you-should-know"))
                    .build();
    
            return Box.builder()
                    .layout(FlexLayout.VERTICAL)
                    .spacing(FlexMarginSize.SM)
                    .contents(asList(spacer, separator, websiteAction))
                    .build();
    
        }
}
