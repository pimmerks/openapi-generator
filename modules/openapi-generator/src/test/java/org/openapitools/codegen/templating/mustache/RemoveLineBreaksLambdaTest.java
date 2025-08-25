package org.openapitools.codegen.templating.mustache;

import org.testng.annotations.Test;

import java.util.Map;

public class RemoveLineBreaksLambdaTest extends LambdaTest {
    @Test
    public void removeLineBreaksLFTest() {
        // Given
        Map<String, Object> ctx = context("removeLineBreaks", new RemoveLineBreaks());

        // When & Then
        test("This is a multiline string!", "{{#removeLineBreaks}}This \nis a \nmulti\nline \nstring!{{/removeLineBreaks}}", ctx);
    }

    @Test
    public void removeLineBreaksCRLFTest() {
        // Given
        Map<String, Object> ctx = context("removeLineBreaks", new RemoveLineBreaks());

        // When & Then
        test("This is a multiline string!", "{{#removeLineBreaks}}This \r\nis a \r\nmulti\r\nline \r\nstring!{{/removeLineBreaks}}", ctx);
    }

    @Test
    public void removeLineBreaksCRTest() {
        // Given
        Map<String, Object> ctx = context("removeLineBreaks", new RemoveLineBreaks());

        // When & Then
        test("This is a multiline string!", "{{#removeLineBreaks}}This \ris a \rmulti\rline \rstring!{{/removeLineBreaks}}", ctx);
    }
}
