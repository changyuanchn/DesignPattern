package com.changyuan.TemplatePattern.SimpleTemplatePattern;

public class TemplatePatternTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepare();
        Tea tea = new Tea();
        tea.prepare();
    }
}
