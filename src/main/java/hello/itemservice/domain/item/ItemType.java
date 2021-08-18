package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2021/08/18
 */
@AllArgsConstructor
public enum ItemType {

    BOOK("도서"),
    FOOD("음식"),
    ETC("음식");

    private final String description;

}
