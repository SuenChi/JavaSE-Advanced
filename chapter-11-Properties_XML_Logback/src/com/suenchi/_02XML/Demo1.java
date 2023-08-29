package com.suenchi._02XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static class Order{
        private String id;
        private String productName;
        private Integer productPrice;
        private Integer count;
        private String category;
        private LocalDate saleDate;

        @Override
        public String toString() {
            return "Order{" +
                    "id='" + id + '\'' +
                    ", productName='" + productName + '\'' +
                    ", productPrice=" + productPrice +
                    ", count=" + count +
                    ", category='" + category + '\'' +
                    ", saleDate=" + saleDate +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Integer getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(Integer productPrice) {
            this.productPrice = productPrice;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public LocalDate getSaleDate() {
            return saleDate;
        }

        public void setSaleDate(LocalDate saleDate) {
            this.saleDate = saleDate;
        }

        public Order(String id, String productName, Integer productPrice, Integer count, String category, LocalDate saleDate) {
            this.id = id;
            this.productName = productName;
            this.productPrice = productPrice;
            this.count = count;
            this.category = category;
            this.saleDate = saleDate;
        }

        public Order() {
        }
    }

    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("chapter-11-Properties_XML_Logback/src/com/suenchi/_02XML/orders.xml");
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements("order");
        ArrayList<Order> orderArrayList=new ArrayList<>(elements.size());
        for (Element element : elements) {
            String id = element.attributeValue("id");
            String productName = element.elementText("productName");
            String productPrice = element.elementText("productPrice");
            String count = element.elementText("count");
            String category = element.elementText("category");
            String saleDate = element.elementText("saleDate");
            orderArrayList.add(new Order(id,productName,Integer.valueOf(productPrice),Integer.valueOf(count),category,LocalDate.parse(saleDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("第 "+(i+1)+" 个订单信息: "+orderArrayList.get(i));
        }
    }
}