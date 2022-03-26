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

public class Food4Pv2 implements Supplier<FlexMessage> {
    public class Food4Pv2 implements Supplier<FlexMessage> {
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
                    .url("http://1.bp.blogspot.com/-O3qNkpD_3kU/ViHhUcQP1JI/AAAAAAAAAHA/SG9iDCdp7TE/s400/%25E0%25B8%2584%25E0%25B8%25B1%25E0%25B9%2588%25E0%25B8%25A7%25E0%25B8%2596%25E0%25B8%25B1%25E0%25B9%2588%25E0%25B8%25A7%25E0%25B9%2580%25E0%25B8%2599%25E0%25B9%2588%25E0%25B8%25B2.jpg")
                    .size(Image.ImageSize.FULL_WIDTH)
                    .aspectRatio(ImageAspectRatio.R20TO13)
                    .aspectMode(ImageAspectMode.Cover)
                    .action(new URIAction("label", "http://example.com"))
                    .build();
        }
    
        private Box createBodyBlock() {
            final Text title = Text.builder()
                    .text("วิธีทำคั่วถั่วเน่า")
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
                                .text("วัตถุดิบ\n1.แอ๊บถั่วเน่า\n2.หมูสับ\n3.พริกชี้ฟ้า\n4.หอมแดง\n5.กระเทียม\n6.น้ำเปล่า\\n1.นำแอ๊บถั่วเน่าแกะห่อใส่ชามเตรียมไว้\n2.นำพริกชี้ฟ้ามาหั่นแฉลบ ส่วนหอมแดงปอกเปลือกแล้วซอยหยาบใส่ถ้วยเตรียมไว้ พร้อมกับหมูสับและไข่ไก่\n3.ทีนี้ก็ใส่หมูสับ พริกชี้ฟ้า หอมแดง และไข่ไก่ลงไปในชามที่ใส่ถั่วเน่าเตรียมไว้\n4.ใช้ส้อมค่อยๆ คนให้ส่วนผสมเข้ากัน ปรุงรสด้วยน้ำปลา\n5.ตั้งกระทะใส่น้ำมัน พอน้ำมันร้อนใส่กระเทียมสับลงไปเจียวให้หอม\n6. ใส่ส่วนผสมในชามลงไปไปผัด ผัดจนแห้ง ชิมรส ตักใส่ถ้วยเสิร์ฟพร้อมผักสดตามชอบ\n")
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
