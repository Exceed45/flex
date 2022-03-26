//น่าน ปิ๊ป

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

import static java.util.Arrays.asList;

public class province3 Supplier<FlexMessage> {
    @Override
    public FlexMessage get() {
    final Bubble bubble1 = createBubble("แกงเห็ดเผาะ",
    "5",
    "https://drive.google.com/file/d/1AzN75pbkrCMgeYofMnlZ7UmY418dE9f4/view?usp=sharing",
    false);
    final Bubble bubble2 = createBubble("แกงแคกบ",
    "5",
    "https://drive.google.com/file/d/1NdA8h2DCr9WJDvHA-HgfIJZQmD0zMNLB/view?usp=sharing",
    true);
    final Bubble bubble3 = createBubble("น้ำพริกเห็ดด่าน",
    "5",
    "https://drive.google.com/file/d/1vRkMKJQp0uffbxS0gWyqPuMozL13DEUh/view?usp=sharing",
    true);
    final Bubble bubble4 = createBubble("ส้ามะเขือ",
    "5",
    "https://drive.google.com/file/d/1At0Gq2hcO3JSMFJSBKjDAeD68iwB5_We/view?usp=sharing",
    true);
   
        final Bubble seeMore = createSeeMoreBubble();
        final Carousel carousel = Carousel.builder()
                .contents(asList(bubble1, bubble2, bubble3, bubble4, bubble5, bubble6, bubble7 ,seeMore))
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
                                        .action(new URIAction("Web site", "http://chincin99.blogspot.com/p/blog-page_33.html"))
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
