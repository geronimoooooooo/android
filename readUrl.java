URL url;
try {
	url = new URL("http://www.orf.at");
	   URLConnection urlConnection = url.openConnection();
	   InputStream in = new BufferedInputStream(urlConnection.getInputStream());
	   BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	   String line;
        while ((line = reader.readLine()) != null) {
          builder.append(line);
        }
        System.out.println(line);
} catch (MalformedURLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
