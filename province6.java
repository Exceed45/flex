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

import java.util.function.Supplier;

import javax.swing.Box;

import static java.util.Arrays.asList;
public class province6 implements Supplier<FlexMessage> {
    @Override
    public FlexMessage get() {
    final Bubble bubble1 = createBubble("แกงฮังเล",
    "5","https://www.maeban.co.th/upload_images/image/features/curry_original.jpg",ture);
    final Bubble bubble2 = createBubble("ข่างปอง",
    "5","https://i.pinimg.com/originals/c6/04/f3/c604f36c4fc175a607f2e919308b9c0c.jpg",ture);
    final Bubble bubble3 = createBubble("ถั่วเน่าเมอะ", 
    "5", "https://ikasalong.com/wp-content/uploads/2020/04/Thua-nao-moe.jpg", ture);
    final Bubble bubble4 = createBubble("จอผักกาด", 
    "5", "https://static.thairath.co.th/media/Dtbezn3nNUxytg04agCxz3X5mgMISDGWXTpu23dHUqsoCG.webp", ture);
        final Bubble seeMore = createSeeMoreBubble();
        final Carousel Carousel = Carousel.builder()
         .content(aslist(bubble1, bubble2, bubble3, bubble4,seeMore))
         .build();
        return new FlexMessage("Catalogue", Carousel);
    }
    private Bubble createBubble(String title, String price, String imageURL, Boolean isOutOfStock) {
        final Image heroBlock = createHeroBlock(imageURL);
        final Box badyBlock = createBodyBlock(title, price, isOutOfStock);
        return Bubble.builder();
    }

        private Bubble createSeeMoreBubble() {
            return Bubble.builder()
                    .body(Box.builder()
                            .layout(FlexLayout.VERTICAL)
                            .spacing(FlexMarginSize.SM)
                            .contents(asList(
                                    Button.builder()
                                            .flex(1)
                                            .gravity(FlexGravity.CENTER)
                                            .action(new URIAction("Web site", "https://www.eventpop.me/blogs/638-7-food-chiang-mai"))
                                            .build()
                            )).build()
                    )
                    .build();
        }
    
        private Image createHeroBlock(String imageURL) {
            return Image.builder()
                    .size(Image.ImageSize.FULL_WIDTH)
                    .aspectRatio(Image.ImageAspectRatio.R20TO13)
                    .aspectMode(Image.ImageAspectMode.Cover)
                    .url(imageURL)
                    .build();
        }
    
        private Box createBodyBlock(String title, String price, Boolean isOutOfStock) {
            final Text titleBlock = Text.builder()
                    .text(title)
                    .gravity(FlexGravity.CENTER)
                    .wrap(true)
                    .weight(Text.TextWeight.BOLD)
                    .size(FlexFontSize.XL).build();
        
    
            FlexComponent[] flexComponents = {titleBlock};
            List<FlexComponent> listComponent = new ArrayList<>(Arrays.asList(flexComponents));
    
            return Box.builder()
                    .layout(FlexLayout.VERTICAL)
                    .spacing(FlexMarginSize.SM)
                    .contents(listComponent)
                    .build();
        }

    }
