package prototype;

import documents.Document1;
import documents.DocumentosRegistry2;

public class Prototype2 {

    public static void main(String[] args) {

        DocumentosRegistry2 registry2 = new DocumentosRegistry2();
        Document1 pdfRestrito = registry2.getDocumento2("PDF RESTRITO");
        System.out.println(pdfRestrito);
        pdfRestrito.nome = "ListaDeMembros.pdf";
        System.out.println(pdfRestrito);

        pdfRestrito = registry2.getDocumento2("PDF RESTRITO");
        System.out.println(pdfRestrito);

    }



}
