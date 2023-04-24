# API versioning

API versioning is a way of managing changes to an API over time. As an API evolves, it's often necessary to make changes that are not backward compatible. 
This means that if client applications are built against an older version of the API, they may not work properly with the new version.

# There are several approaches to versioning an API, including:

1. URL-based versioning: 
   - This approach adds a version number to the API's URL. 
   - Each new version of the API would have a different URL.
   - Example: https://api.example.com/v1/users
   
2. Query parameter versioning: 
   - This approach adds a version number as a query parameter.
   - Example: https://api.example.com/users?version=1.

3. Header-based versioning: 
   - This approach adds a version number as a custom header.
   - Example: X-API-Version: 1.

4. Content negotiation versioning: 
   - This approach uses the Accept header to indicate the desired API version
   - Example: Accept: application/vnd.example.v1+json.
