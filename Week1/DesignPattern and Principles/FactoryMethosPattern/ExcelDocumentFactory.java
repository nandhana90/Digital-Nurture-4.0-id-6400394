package FactoryMethodpattern;

public class ExcelDocumentFactory extends DocumentFactory{
	 @Override
	    public Document createDocument() {
	        return new ConcreteExcelDocument();
	    }
}
