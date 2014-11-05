//Project>app>src>main>assets>text.txt
//create assets folder in main


InputStream is = null;
        try {
            is = getResources().getAssets().open("text.txt");
        } catch (IOException ex){
            ex.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;

        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = sb.toString();
        System.out.println("Text: "+text);
