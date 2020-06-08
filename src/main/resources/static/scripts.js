window.addEventListener("load", function(){
    console.log('Window loaded and ready to handle events.');

//declare elements
//    let navLinkList = document.getElementById('nav-link-ul');
//    let navHeader = document.getElementById('nav-header');
//
//    let navLinkVisibility;
 //.style.visibility='visible'"
//    navHeader.addEventListener("click", function(){
//        if (!navLinkVisibility) {
//            navLinkList.style.visibility = 'visible';
//            navHeader.innerHTML = "v&thinsp;coffee";
//            navLinkVisibility = true;
//        } else {
//            navLinkList.style.visibility = 'hidden';
//            navHeader.innerHTML = ">&thinsp;coffee";
//            navLinkVisibility = false;
//        }
    var cafeItems = document.getElementsByClassName("cafe-item");
    var palette = ['#F7A072', '#605C4E', '#A49966', '#BAA200', '#D4AFB9', '#59656F', '#653239' ,'#71816D', '#342A21', '#6290C3', '#FAA300'];
    for (var i = 0; i < cafeItems.length; i++){
    var randomColor = Math.floor(Math.random() * palette.length);
    cafeItems[i].style.backgroundColor = palette[randomColor];
    }

//    })
});
