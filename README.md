Even with all the OS level security, JVM level security and all
other security we allow users to access the APIs and there can 
be potential threat to our application. So some security mechanism
is needed to overcome the threat. Hence Spring Security is added
to provide application level security.

Spring Security like any security asks two important questions :-  
Who are you?  
What do you want?

_**Why Spring Security :-**_  
Login and Logout functionality  
Allow/Block access to URLs to logged in users  
Allow/Block access to URLs to logged AND with certain roles  
Very flexible and customizable  
Handles common vulnerabilities like session fixation, click
jacking, click site request forgery  
Widely adopted

**_What can be done with Spring Security :-_**  
Username / password authentication  
SSO / Okta / LDAP  
App level authorization  
Intra App Authorization like OAuth  
Micro service security (using tokens, JWT)  
Method level security

**_Five Core concepts of Spring Security :-_**  
**Authentication** - Providing with your username and password to prove the authenticity of
yourself. This can be Knowledge based like password, pin, answer to a question and if 
someone has access to it they can get in as you.It is easier to implement and less safe.
The other type is Possession based like being in possession of something like your phone, 
key cards and badges. It is most likely that if someone is in possession of these then 
like it might be you. Some use combination of both which is multi factor authentication.  
**Authorization** - Knowing if a certain user can perform a certain role based on the access
the user has. Before deciding the access for the user, authentication must be done to verify 
the user.  
**Principal** - Currently logged in user in the context of the application. This is stored
so that the user does not need to log in on every page load. Even if some one has more than
one account in an application, the user that is logged is stored in principal and when the
person switches to another user, the other user is stored in the principal.  
**Authority** - Also known as granted authority, when a user logs in, the permissions 
one has. Some users may have simple permissions while others have more complicated
permissions. If certain users do not have certain permissions, the application by default
does not allow.These are more fine grained.  
**Role** - Granting same authority to a group of users can be tedious, so roles are created
to assign just the role to user which in turn would have the permissions granted before 
hand to the role. These are more coarse grained.

Just by adding spring-security-starter dependency in pom, spring provides default implementation
with username being _user_ and password _generated_ by spring every time the application is started.

We can **_override_** the default credentials by adding them in **_application.properties_**.
