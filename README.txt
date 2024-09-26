WHAT IS SPRING-MODULITH?
========================

Spring Modulith allows developers to build well-structured Spring Boot applications and guides developers in finding
and working with application modules driven by the domain. It supports the verification of such modular arrangements,
integration testing individual modules, observing the application’s behavior on the module level and creating
documentation snippets based on the arrangement created.


In microservice architecture, we are building independently deployable services each providing a specific business
capability.

Both Microservice and Monolithic architectures have pros and cons.

Due to this people are looking for a middle ground of these two(called as Modular Monoliths).

Let's see how "Spring-Modulith" project helps us to build Modular Monolith application.

SPRING-MODULITH CONCEPTS
========================

1. According to spring-modulith, all the sub packages of the root package are considered as "Application Modules"

2. If there are public classes inside Application-Modules they are considered as API for that particular module.

3. No other Application-Modules can directly access the internals of another Application-Module.
If needed it should happen via the public API exposed

4. Classes in a given Application-Module can access each other


Official Documentation : https://docs.spring.io/spring-modulith/docs/current-SNAPSHOT/reference/html/