//พะเยา
package com.linefood.bot.flex;

import com.linecorp.bot.model.action.URIAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.flex.component.*;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.container.Carousel;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexGravity;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;
import com.linecorp.bot.model.message.flex.unit.FlexMarginSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

public class province4 implements Supplier<FlexMessage> {
        @Override
        public FlexMessage get() {
        final Bubble bubble1 = createBubble("แกงเห็ดห้า",
        "5",
        "http://beautyinfoo.com/wp-content/uploads/2020/01/%E0%B9%81%E0%B8%81%E0%B8%87%E0%B9%80%E0%B8%AB%E0%B9%87%E0%B8%94%E0%B8%95%E0%B8%B1%E0%B8%9A%E0%B9%80%E0%B8%95%E0%B9%88%E0%B8%B2.jpg",
        false);
        final Bubble bubble2 = createBubble("ยำฮก ",
        "5",
        "https://w2.med.cmu.ac.th/suandok-variety/wp-content/uploads/2020/07/D0131A4C-39D6-45A1-BEFE-1450889A6AF9.jpeg",
        true);
        final Bubble bubble3 = createBubble("คั่วถั่วเน่า",
        "5",
        "http://1.bp.blogspot.com/-O3qNkpD_3kU/ViHhUcQP1JI/AAAAAAAAAHA/SG9iDCdp7TE/s400/%25E0%25B8%2584%25E0%25B8%25B1%25E0%25B9%2588%25E0%25B8%25A7%25E0%25B8%2596%25E0%25B8%25B1%25E0%25B9%2588%25E0%25B8%25A7%25E0%25B9%2580%25E0%25B8%2599%25E0%25B9%2588%25E0%25B8%25B2.jpg",
        true);
        final Bubble bubble4 = createBubble("ไข่ป่าม",
        "5",
        "https://img.kapook.com/u/surauch/movie2/bake-egg.jpg",
        true);
        
            final Bubble seeMore = createSeeMoreBubble();
            final Carousel carousel = Carousel.builder()
                    .contents(asList(bubble1, bubble2, bubble3, bubble4,seeMore))
                    .build();
            return new FlexMessage("Catalogue", carousel);
        }
    
        private Bubble createBubble(String title, String price, String imageURL, Boolean isOutOfStock) {
            final Image heroBlock = createHeroBlock(imageURL);
            final Box bodyBlock = createBodyBlock(title, price, isOutOfStock);
            return Bubble.builder()
                    .hero(heroBlock)
                    .body(bodyBlock)
                    .build();
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
