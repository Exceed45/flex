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
public class province7 implements Supplier<FlexMessage> {
    @Override
    public FlexMessage get() {
    final Bubble buble1 = createBubble("ลาบลำปาง",
    "5","https://ikasalong.com/wp-content/uploads/2020/04/larb-moo-final-dip.jpg",ture);
    final Bubble bubble2 = createBubble("แกงแคไก่เมือง",
    "5","https://i.ytimg.com/vi/Jvf4KMuuoEQ/maxresdefault.jpg",ture);
    final Bubble bubble3 = createBubble("หลามบอน",
    "5","https://i.ytimg.com/vi/t9NCXpRkjLs/maxresdefault.jpg",ture);
    final Bubble bubble4 = createBubble("แกงแคหอย",
    "5","https://i.ytimg.com/vi/5KV8elVtwy8/maxresdefault.jpg",ture);
        final Bubble seeMore = createSeeMoreBubble();
        final Carousel Carousel = Carousel.builder()
         .content(aslist(bubble1, seeMore))
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