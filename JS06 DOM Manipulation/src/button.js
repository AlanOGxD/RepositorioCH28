const button = document.getElementById('card-btn');
const cardSection = document.getElementById('card-section');
cardSection.style.visibility = 'visible';

/*
button.addEventListener('click', e => {

    
    if(cardSection.style.visibility === 'hidden') {
            cardSection.style.visibility = 'visible';
        } else {
                cardSection.style.visibility = 'hidden';
            }
})
*/

button.addEventListener('click', e => {
    cardSection.style.visibility = (cardSection.style.visibility === 'hidden') ? 'visible' : 'hidden';
})