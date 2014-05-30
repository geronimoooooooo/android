------------------------------
nicht getestet: http://stackoverflow.com/questions/4233350/android-get-response-from-a-https-url

HttpPost post = new HttpPost("https://yourdomain.com/yourskript.xyz");
List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
nameValuePairs.add(new BasicNameValuePair("postValue1", "my Value"));
nameValuePairs.add(new BasicNameValuePair("postValue2", "2nd Value"));
post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

HttpClient client = new DefaultHttpClient();
HttpResponse response = client.execute(post);
HttpEntity entity = response.getEntity();

String responseText = EntityUtils.toString(entity);

--------------------------------
