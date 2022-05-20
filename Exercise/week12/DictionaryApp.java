package week12;

abstract class PairMap {
    protected String keyArray[];
    protected String valueArray[];

    abstract String get(String key);

    abstract void put(String key, String value);

    abstract String delete(String key);

    abstract int length();
}

class Dictionary extends PairMap{
    private int count =0;
    public Dictionary(int i){
        keyArray = new String[i];
        valueArray = new String[i];
    }

    @Override
    String get(String key) {
         for(int i=0; i<count; i++) {
            if(key.equals(keyArray[i])){
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < count; i++) {
            if (key.equals(keyArray[i])) {
                valueArray[i] = value;
                return;
            }
        }
        keyArray[count] = key;
        valueArray[count] = value;
        count++;
    }

    @Override
    String delete(String key) {
        for (int i = 0; i < count; i++) {
            if (key.equals(keyArray[i])) {
                valueArray[i] = null;
                return null;
            }
        }
        return key;
    }

    @Override
    int length() {
        return count;
    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
    
}
