package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2021/08/18
 */
@Getter
@AllArgsConstructor
public enum ItemType {

    BOOK("도서"),
    FOOD("음식"),
    ETC("기타");

    private final String description;

}
