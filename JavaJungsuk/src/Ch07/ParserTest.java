package Ch07;

interface Parseable {
    // 구문 분석 작업 수행
    public abstract void parse(String filename);
}

class ParserManager {
    // 리턴타입이 Parseable인터페이스
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable {
    public void parse(String filename) {
        System.out.println(filename + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "-HTML parsing completed.");
    }
}
public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.htmlr");
    }
}
