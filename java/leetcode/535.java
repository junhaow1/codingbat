public class Codec {

    Map<String,String> my = new HashMap<String,String>();
    String base = "http://tinyurl.com/";


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        // String base = "http://tinyurl.com/";
        String short1 = base + longUrl.hashCode();
        my.put(short1,longUrl);
        return short1;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUr  n  l) {
        return my.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));


//medium question
//https://leetcode.com/problems/encode-and-decode-tinyurl/
//535. Encode and Decode TinyURL
