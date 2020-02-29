window.addEventListener("load", function(){
    console.log('Window loaded and ready to handle events.');

//declare elements
    let navLinkList = document.getElementById('nav-link-ul');
    let navHeader = document.getElementById('nav-header');

    let navLinkVisibility;
 //.style.visibility='visible'"
    navHeader.addEventListener("click", function(){
        if (!navLinkVisibility) {
            navLinkList.style.visibility = 'visible';
            navHeader.innerHTML = "v&thinsp;coffee";
            navLinkVisibility = true;
        } else {
            navLinkList.style.visibility = 'hidden';
            navHeader.innerHTML = ">&thinsp;coffee";
            navLinkVisibility = false;
        }



    })
});
