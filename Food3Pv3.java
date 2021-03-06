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

public class Food3Pv3 implements Supplier<FlexMessage>{
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
                    .url("http://3.bp.blogspot.com/-gvZ2FeD53u4/T9JEoei1_RI/AAAAAAAATAQ/O9cqEBH-qnc/s1600/0001WYD949C9F7D7ACE72El.jpg")
                    .size(Image.ImageSize.FULL_WIDTH)
                    .aspectRatio(ImageAspectRatio.R20TO13)
                    .aspectMode(ImageAspectMode.Cover)
                    .action(new URIAction("label", "http://example.com"))
                    .build();
        }
    
        private Box createBodyBlock() {
            final Text title = Text.builder()
                    .text("วิธีทำน้ำพริกเห็ดด่าน")
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
                                .text("ส่วนผสม\n1.เห็ดไค 10 ดอก\n2.พริกชี้ฟ้า 21 เม็ด\n3.เกลือป่น 1 ช้อนชา\n4.ต้นหอม 1 ต้น\n5.ผักชี 1 ต้น\n6.กระเทียม 1 หัว\n7.หอมแดง 5 หัว\nเครื่องปรุง\n1.พริกชี้ฟ้า 21 เม็ด\n2.เกลือป่น 1 ช้อนชา\n3.ต้นหอม 1 ต้น\n4.ผักชี 1 ต้น\n5.กระเทียม 1 หัว\n6.หอมแดง 5 หัว\nขั้นตอนการทำ\n1. ล้างเห็ดให้สะอาด (ล้างโดยการล้างผ่านก๊อกน้ำประมาณ 4-5 รอบ) \n2. นำเห็ดมาใส่กะทะตั้งไฟ คั่วให้สุกและมีกลิ่นหอม ถ้ามีเตาถ่านหรือไมโครเวฟก็เอาย่างหรืออบก็ได้ ในขั้นตอนน้ใส่เกลือลงไปด้วย\n3. คั่วพริก กระเทียม หอมแดงให้สุก แล้วนำมาปอกเปลือกส่วนที่ไหม้ออก\n4. ตำพริก กระเทียม หอมแดงให้ละเอียดและใส่เห็ดลงไป ตำให้พอละเอียดแต่ไม่ต้องละเอียดมาก\n5. ปรุงรสอีกครั้ง ใส่ต้นหอมผักชีซอย\nเคล็ดลับ: หากชอบปลาร้าก็ใส่ลงไปด้วยจะเพิ่มความเข้มข้น\n")
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
