package workshop;

public class cookies {

    List<String> cookie = new ArrayList<String>();

    public void readCookieFile(String inputFile){
        Reader reader = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(reader);

        String line = " ";
        while (line = br.readLine() != null){
            cookie.add(line);
        }
        br.close();
        reader.close();

    }

    public String getRandomCookie() {
        Random rand = new Random();

        if (cookie != null){
            while(cookie.size() > 0){
                return cookie.get(rand.nextInt(cookies.size()));
            }
    
        } else {
            return "No cookie found!";
        }
    }

    public void printCookies() {
        while(cookie.size() > 0){
            cookie.forEach(System.out::println);
        }
    }
    
    
}
