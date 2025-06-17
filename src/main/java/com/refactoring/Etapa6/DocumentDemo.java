package com.refactoring.Etapa6;

import java.util.List;

public class DocumentDemo {
    public static void main(String[] args) {
        List<Document> docs = List.of(
                new PdfDocument(),
                new HtmlDocument(),
                new TextDocument()
        );

        for (Document doc : docs) {
            doc.print();    // polimorfismo em ação
        }
    }
}
