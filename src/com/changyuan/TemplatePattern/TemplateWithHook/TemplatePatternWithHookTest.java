package com.changyuan.TemplatePattern.TemplateWithHook;

import com.changyuan.TemplatePattern.SimpleTemplatePattern.CaffeineBeverage;

public class TemplatePatternWithHookTest {
    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepare();

        CaffeineBeverageWithHook coffee1 = new CoffeeWithHook();
        coffee1.prepare();
    }
}
