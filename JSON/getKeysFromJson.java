 Gets the only and single key for json: boss1
 key::::::::::::::::::::::::::::boss1
 key::::::::::::::::::::::::::::boss2
        
        JSONObject jObject = new JSONObject(json.trim());
        Iterator<?> keys = jObject.keys();
        System.out.println("Gets the only and single key for json: "+jObject.keys().next());

        while( keys.hasNext() ){
            String key = (String)keys.next();
            System.out.println("key::::::::::::::::::::::::::::"+key);
        }
        
{
    "boss1": [
        {
            "hash": {
                "0": "0 zero",
                "1": "1 uno"
            },
            "array": [
                "zero",
                "uno"
            ],
            "name": "GeoZilla"
        },
        {
            "hash": {
                "0": "0 zero",
                "1": "1 uno"
            },
            "array": [
                "zero",
                "uno"
            ],
            "name": "GeoZilla"
        },
        {
            "hash": {
                "0": "0 zero",
                "1": "1 uno"
            },
            "array": [
                "zero",
                "uno"
            ],
            "name": "GeoZilla"
        }
    ],
    "boss2": [
            {
                "hash": {
                    "0": "0 zero",
                    "1": "1 uno"
                },
                "array": [
                    "zero",
                    "uno"
                ],
                "name": "GeoZilla"
            },
            {
                "hash": {
                    "0": "0 zero",
                    "1": "1 uno"
                },
                "array": [
                    "zero",
                    "uno"
                ],
                "name": "GeoZilla"
            },
            {
                "hash": {
                    "0": "0 zero",
                    "1": "1 uno"
                },
                "array": [
                    "zero",
                    "uno"
                ],
                "name": "GeoZilla"
            }
        ]
}
