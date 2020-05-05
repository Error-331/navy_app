
You can specify a different port by using the -port argument:

grails run-app -port=8090

grails-app - top level directory for Groovy sources

conf - Configuration sources

controllers - Web controllers - The C in MVC.

domain - The application domain. - The M in MVC

i18n - Support for internationalization (i18n).

services - The service layer.

taglib - Tag libraries.

utils - Grails specific utilities.

views - Groovy Server Pages or JSON Views - The V in MVC.

src/main/scripts - Code generation scripts.

src/main/groovy - Supporting sources

src/test/groovy - Unit and integration tests.


garils create-controller hello
grails test-app
grails war - This will produce a WAR file under the build/libs directory which can then be deployed as per your container’s instructions.


println request.properties

servletContext - Also known as application scope, this scope lets you share state across the entire web application. The servletContext is an instance of ServletContext

session - The session allows associating state with a given user and typically uses cookies to associate a session with a client. The session object is an instance of HttpSession

request - The request object allows the storage of objects for the current request only. The request object is an instance of HttpServletRequest

params - Mutable map of incoming request query string or POST parameters

flash - See below


Name
Surname
Patronomic
salary
currency_id
citezenship_country_id
position_id
english_level_id
add_date
update_date
delete_date


contacts
id
user_id
phone_id


phones
id
number
number_code_id

phone_codes
id
code

certificates
certificate_name_id
number
place_of_issue
date_of_issue
date_valid_end

CREATE DATABASE IF NOT EXISTS navy_db;


grails install-plugin seed-me
