const headerRef = document.querySelector('.header');

document.addEventListener('scroll',e=>{
    
    const currPos = window.scrollY;

    if(currPos==0)
        headerRef.classList.remove('transparent');

    else
        headerRef.classList.add('transparent');
})