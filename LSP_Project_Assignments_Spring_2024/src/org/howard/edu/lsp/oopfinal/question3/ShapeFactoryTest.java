package org.howard.edu.lsp.oopfinal.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTest {

    @Test
    void testCreateCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("Circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    void testCreateRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape rectangle = factory.createShape("Rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
}

