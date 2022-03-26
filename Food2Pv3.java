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

public class Food2Pv3 implements Supplier<FlexMessage>{
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
                    .url("http://2.bp.blogspot.com/-BVOOY4R36fc/Vh3SRAHN8jI/AAAAAAAAAFg/DOKBb7rtqsI/s1600/hanjaonua-food-014.jpg")
                    .size(Image.ImageSize.FULL_WIDTH)
                    .aspectRatio(ImageAspectRatio.R20TO13)
                    .aspectMode(ImageAspectMode.Cover)
                    .action(new URIAction("label", "http://example.com"))
                    .build();
        }
    
        private Box createBodyBlock() {
            final Text title = Text.builder()
                    .text("วิธีทำข้าวกั้นจิ้น")
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
                                .text("ส่วนผสม\n1.ข้าวสวยหุงสุก4 ถ้วย\n2.เลือดหมูสด1 ถ้วย\n3.ใบตะไคร้4 ใบ\n4.เกลือป่น2 ช้อนชา\n5.ผงปรุงรส1 ช้อนชา\n6.กระเทียมเจียวตามชอบ\n7.หอมแดงซอยตามชอบ\n8.แตงกวาตามชอบ\n9.พริกทอดตามทอด\nวิธีทำ\n1.เวลาเตรียมส่วนผสม: 10 นาที\n2.เวลาปรุงอาหาร: 1 ชั่วโมง\n\n1. นำเลือดหมูสดมาคั้นกับใบตะไคร้ เพื่อลดความคาว\n2. นำเลือดมาคลุกกับข้าวสวย และปรุงรสด้วย เกลือ และผงปรุงรส\n3. นำลงในหม้อหุงข้าว โดยพรมน้ำเล็กน้อย กดปุ่ม cook หรือถ้าใครมีใบตองสามารถห่อ แล้วนำมาวางบนซึ้งที่แถมมากับหม้อหุงข้าวก็ได้\n4 . ใช้เวลานึ่ง 20-25 นาที\n5 . รับประทานกับเครื่องเคียง โดยราดน้ำมันหอมเจียว หอมแดงซอย พริกทอด และ แตงกวา\nเคล็ดลับ: ถ้าหุงในหม้อหุงข้าว ครั้งแรก เลือดอาจจะยังไม่สุกทั่วถึง ให้เปิดคนและกด cook ต่อ ( หม้อหุงควรเป็นหม้อเทปลอน เพื่อไม่ให้ข้าวติดก้น)\n")
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
