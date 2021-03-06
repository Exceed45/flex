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

public class Food4Pv1 implements Supplier<FlexMessage> {
    public class Food4Pv1 implements Supplier<FlexMessage> {
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
                    .url("http://beautyinfoo.com/wp-content/uploads/2020/01/%E0%B9%81%E0%B8%81%E0%B8%87%E0%B9%80%E0%B8%AB%E0%B9%87%E0%B8%94%E0%B8%95%E0%B8%B1%E0%B8%9A%E0%B9%80%E0%B8%95%E0%B9%88%E0%B8%B2.jpg")
                    .size(Image.ImageSize.FULL_WIDTH)
                    .aspectRatio(ImageAspectRatio.R20TO13)
                    .aspectMode(ImageAspectMode.Cover)
                    .action(new URIAction("label", "http://example.com"))
                    .build();
        }
    
        private Box createBodyBlock() {
            final Text title = Text.builder()
                    .text("วิธีทำแก๋งเห็ดห้า")
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
                                .text("วัตถุดิบ\n1.เห็ดตับเต่า\n2.ใบมะเม่าหรือยอดส้มป่อย\n3.พริกแห้ง\n4.พริกขี้หนู\n5.กระเทียม\n6.หอมแดง\n7.กะปิหยาบ\n8.เหลือ\n9.น้ำมะขาม\nวิธีทำ\n1.ก่อนล้างเห็ดตับเต่า ให้แช่น้ำไว้สักครู่ ให้ทรายหลุดออกจากเห็ดก่อน แล้วล้างให้สะอาด ตัดส่วนที่แข็งกินไม่ได้ออกไป จากนั้นหั่นเห็ดเป็นชิ้นเล็กๆ พอดีคำ\n2.ตั้งน้ำให้เดือด เอาเห็ดใส่ลงไป พอเห็ดสุก ตักขึ้นพักไว้ให้สะเด็ดน้ำ\n3.นำครกมาโขลกเครื่องแกง โดยใส่ พริกใหญ่แห้ง พริกขี้หนูแห้ง หอมแดง กระเทียม กะปิหยาบและเกลือ\n4.นำหม้อใส่น้ำขึ้นตั้งไฟ ใส่พริกแกง ใบมะเม่าและใบส้มป่อยอ่อนลงไป ปิดฝาหม้อ ตั้งต่ออีกประมาณ 2-3 นาที\n5.เมื่อน้ำเดือดใส่เห็ดตับเต่าที่เราหั่นไว้ตามลงไป\n6.ต้มไว้สักครู่พอเห็ดสุกทั่ว ปรุงรสชาติด้วยน้ำมะขามเปียก และเกลือ \nเคล็ดลับ: น้ำที่ใช้ต้ม จะให้ดีควรเป็นซุปต้มกระดูกหมู เพราะจะได้ความหวานจากน้ำต้มกระดูก รวมทั้งสามารถใส่หมูบด หมูสามชั้น หรือซี่โครงหมูลงไป ก็จะได้แกงเห็ดตับเต่า รสชาติเปรี้ยว กลมกล่อม และหอมน้ำต้มกระดูก \n")
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
                    .action(new URIAction("WEBSITE", "http://beautyinfoo.com/thai-food-recipe/"))
                    .build();
    
            return Box.builder()
                    .layout(FlexLayout.VERTICAL)
                    .spacing(FlexMarginSize.SM)
                    .contents(asList(spacer, separator, websiteAction))
                    .build();
    
        }
}
