package dto.Product;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

public class Product {
    private int idx;
    private String productName;
    private int ordCnt;
    private int totalCnt;

    private Optional<Person> person;

    public int getIdx() {
        return idx;
    }

    public String getProductName() {
        return productName;
    }

    public int getOrdCnt() {
        return ordCnt;
    }

    public int getTotalCnt() {
        return totalCnt;
    }

    public Optional<Person> getPerson() {
        return person;
    }

    public void setPerson(Optional<Person> person) {
        this.person = person;
    }

    public Product(int idx, String productName, int ordCnt, int totalCnt) {
        this.idx = idx;
        this.productName = productName;
        this.ordCnt = ordCnt;
        this.totalCnt = totalCnt;
    }
}
