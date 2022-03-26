//เชียงรายปิ๊ป

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

public class province2 implements Supplier<FlexMessage> {
        @Override
        public FlexMessage get() {
        final Bubble bubble1 = createBubble("ข้าวฟืน",
        "5",
        "https://drive.google.com/file/d/1ubaVgiS1ufzzRZXxadOqoJ2C1uBLFf4k/view?usp=sharing",
        false);
        final Bubble bubble2 = createBubble("ข้าวซอยน้อย ",
        "5",
        "https://drive.google.com/file/d/18ktoYllcT2XeZSByTnYXOD3YHqn5Vk3Z/view?usp=sharing",
        true);
        final Bubble bubble3 = createBubble("ข้าวกั้นจิ้น",
        "5",
        "https://drive.google.com/file/d/1GUE8ncRxpm3uTfIoYipwntjOXIRlXZqi/view?usp=sharing",
        true);
        final Bubble bubble4 = createBubble("แคบหมู",
        "5",
        "https://drive.google.com/file/d/1uM1a-zHMkv1JzD2IpwNL0zPr9_-wD1dN/view?usp=sharing",
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
                                            .action(new URIAction("Web site", "http://sraipatcharee.blogspot.com/2015/10/blog-post_62.html"))
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
