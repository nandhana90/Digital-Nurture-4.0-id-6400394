package FactoryMethodpattern;

public class WordDocumentFactory extends  DocumentFactory{
	@Override
    public Document createDocument() {
        return new ConcreteWordDocument();
    }
}
