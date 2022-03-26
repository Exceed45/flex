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

public class Food5Pv3 implements Supplier<FlexMessage> {
    public class Food5Pv3 implements Supplier<FlexMessage> {
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
                    .url("https://www.pim.in.th/images/all-side-dish-nampric/nampric-ong/nam-pric-ong-10.JPG")
                    .size(Image.ImageSize.FULL_WIDTH)
                    .aspectRatio(ImageAspectRatio.R20TO13)
                    .aspectMode(ImageAspectMode.Cover)
                    .action(new URIAction("label", "http://example.com"))
                    .build();
        }
    
        private Box createBodyBlock() {
            final Text title = Text.builder()
                    .text("วิธีทำน้ำพริกอ่อง")
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
                                .text("วัตถุดิบ\n1.เนื้อหมูบด\n2.มะเขือเทศลูกเล็ก\n3.ผักชี ต้นหอมซอย\n4.น้ำมันพืช\n5.พริกขี้หนูแห้ง\n6.หอมแดง\n7.กระเทียม\n8.กะปิ\n9.เกลือ\nวิธีทำ\n1.โขลกเครื่องปรุงพริกแกง คือ พริก หอมแดง กระเทียม รวมกันให้ละเอียด แล้วจึงใส่กะปิและเกลือ โขลกให้เข้ากัน\n2.ผัดเครื่องแกงกับน้ำมันจนมีกลิ่นหอม ใส่เนื้อหมูบด ลงผัดให้สุก เติมน้ำเล็กน้อย\n3.พอเดือด ใส่มะเขือเทศ ลงผัดให้เข้ากัน ตั้งไฟต่อจนมะเขือเทศสุก ปิดไฟ\n")
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
                    .action(new URIAction("WEBSITE", "https://board.postjung.com/1294440"))
                    .build();
    
            return Box.builder()
                    .layout(FlexLayout.VERTICAL)
                    .spacing(FlexMarginSize.SM)
                    .contents(asList(spacer, separator, websiteAction))
                    .build();
    
        }
}
