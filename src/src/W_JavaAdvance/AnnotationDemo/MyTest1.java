package W_JavaAdvance.AnnotationDemo;

public @interface MyTest1 {
    String aaa();
    boolean bbb() default true;
    String[] ccc();
}
