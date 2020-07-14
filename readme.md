


# Overview
This is an attempt to make transparent the cafes, the suppliers, the farms, etc. It's the cafe's responsibility to make sure their coffee is ethically sourced from farms that benefit their communities. We hope to make the public aware if they do by cataloging the logistic chain from plant to cafe (farms to origins, origins to cafes) There are 200 cafes in KC, and not everyone will participate, but we want to be a core resource in identifying the areas that are least transparent in the coffee-to-cup logistic chain. By doing so, we can rest assured that the farmers putting their time and care into the product are supported for the long-term.

# Features

 1. User Authentication
 2. User account creation
 3. Adding data to a database
 4. Removing data from a database
 5. Modifying data in a database
 6. Search of a database
 7. Visualization of database elements
 8. Use of API to map "logistic chain"

# Technologies

 - Java (Spring, Thymeleaf)
 - Javascript
 - MySQL
 - CSS/HTML

# What I'll Have to Learn

 - Complex MySQL database handling
 - API integration
 - User authentication techniques
 - Securely handling sensitive data
 - Website deployment

# Project Tracker
https://trello.com/b/tu1XRmu7



# Progress Reports

<details>
 <summary>4.13.2020—Wireframing</summary>
 
> After a short hiatus, I'm returning to this project with a fresh mind and intentions of broadening scope. Today, we're tackling wireframing. The original design for the UX seemed clunky, outdated, and difficult to optimize for mobile: 
> 
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/wireframes/alternates/bubble_list_wireframe.png?raw=true" width="600">
>
> The second idea featured more intuitive and scalable navigation techniques, but we weren't quite there...
> 
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/wireframes/alternates/flat_list_ui_wireframe.png?raw=true" width="600">
> 
> These concepts relied too heavily on a widescreen format, and weren't designed with common user experience in mind. They focused on navigation to direct you to the content rather than present it upfront. This could lead to quick user fatigue or disinterest in the website entirely. After conversations with my "in-house designer" and some glances at popular websites, we modified the format.
> 
> Landing Page:
>
><img src="https://github.com/kaleblucas/kc-coffee/blob/master/wireframes/KC-COFFEE-WIREFRAME-1-1.png?raw=true" width="400">
> 
>Cafe Page:
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/wireframes/KC-COFFEE-WIREFRAME-1-2.png?raw=true" width="400">
> 
> 
>Cafe-specific Coffee Page:
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/wireframes/KC-COFFEE-WIREFRAME-1-3.png?raw=true" width="400">
>
>Alas, an experience that's easier to navigate and clearer to the user. We may pull design elements from previous ideas, but implement them in such a way that their usage is more intuitive and remains aware of  usage trends.
>
> \> (end 4.13.2020)
</details>

<details>
 <summary>5.3.2020—Database Handling</summary>
 
>Over this sprint, we added two model classes: Coffee and Farm. This is sketch of how these classes are intended to interact with the whole:
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/5.3.20_sketch1.png?raw=true" width="400">
>
>This will allow us to have more specific and robust data, building greater relationships and should set us up for a more refined experience in the end.
>
>Below is some rough implementation of forms to show proof-of-concept toward the ability to add these entries to the database via the web-UI.
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/5.3.20_forms.PNG?raw=true" width="400">
>
>
>Lastly, here's a clip of what our Coffee data looks like in the database:
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/5.3.20_mysql.PNG?raw=true" width="400">
>
>
> \> (end 5.3.2020)
 </details>
 
<details>
 <summary>6.7.2020—Reaching an MVP</summary>
 
>My documentation skills have lacked over the last several weeks, but we've developed a minimum viable product for this application. The original MVC set-up was flawed in its original conception. We've tabled the idea of introducing 'farms' as it will be more difficult to source that information. The focus we have now is on cafes, their available coffee origins, and describing the origin.
>
>There are still many features to implement, but this is just the beginning!
>
>See the photo-dump below to understand the features currently developed and where the design led us. Right click & open the image in a new tab to see it in full scale.
>
> ___
> 
>Main-page: Shows list of cafes. The color behind the cafe name is randomly chosen based on a color pallet array. 
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/6.7.20_cafe-1.png?raw=true" width="600">
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/6.7.20_cafe-2.png?raw=true" width="600">
>
>___
>Cafe Page: Includes unique map showing location of cafe, a short bio, and a list of the available coffees.
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/6.7.20_cafe-page.png?raw=true" width="600">
>
> ___
>Search: Non-case sensitive search returns results based on the name of the cafe.
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/6.7.20_search.png?raw=true" width="600">
>
>___
>Edit Page: Allows you to select a cafe to edit or add a new entry.
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/6.7.20_edit.png?raw=true" width="600">
>
>___
>Edit Cafe: Modify values and checkbox-select available coffees from a defined list of coffees stored in the database.
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/6.7.20_cafe-edit.png?raw=true" width="600">
>
>___
>Delete Cafe: Ability to remove entry entirely from the database with warning prompt.
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/6.7.20_delete.png?raw=true" width="600">
>
>___
>Add Cafe: Define the cafe here and add it to the database.
>
> <img src="https://github.com/kaleblucas/kc-coffee/blob/master/md_images/6.7.20_cafe-add.png?raw=true" width="600">
> (end 6.7.2020)
 </details>
