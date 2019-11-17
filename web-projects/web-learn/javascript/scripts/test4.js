const customName = document.getElementById('customname');
const randomize = document.querySelector('.randomize');
const story = document.querySelector('.story');

function randomValueFromArray(array){
  return array[Math.floor(Math.random()*array.length)];
}

let chinaOfStoryText = '外边有34度，[插入处1]出去遛弯。当走到[插入处2]时小伙伴们都惊呆了，他[插入处3]。李雷全程目睹但他并没有慌，因为[插入处1]是一个270斤的胖子，天气又辣么热。';

let englishOfStoryText = 'It was 94 fahrenheit outside, so :insertx: went for a walk. When they got to :inserty:, they stared in horror for a few moments, then :insertz:. Bob saw the whole thing, but was not surprised — :insertx: weighs 300 pounds, and it was a hot day.';

let insertXChinese = ['怪兽威利','大老爹','圣诞老人'];

let insertX = ['Willy the Goblin','Big Daddy','Father Christmas'];

let insertYChinese = ['救助站','迪斯尼乐园','白宫'];

let insertY =['the soup kitchen','Disneyland','the White House'];

let insertZChinese = ['自燃了','在人行道化成了一坨泥','变成了一条鼻涕虫爬走了'];

let insertZ = ['spontaneously combusted','melted into a puddle on the sidewalk','turned into a slug and crawled away'];

randomize.addEventListener('click', result);

function result() {
  let newStory,xItem,yItem,zItem,name;
  if(document.getElementById("cn").checked){
   newStory = chinaOfStoryText;
   xItem = randomValueFromArray(insertXChinese);      
   yItem = randomValueFromArray(insertYChinese);
   zItem = randomValueFromArray(insertZChinese);
   newStory = newStory.replace('[插入处1]',xItem);
   newStory = newStory.replace('[插入处1]',xItem);
   newStory = newStory.replace('[插入处2]',yItem);
   newStory = newStory.replace('[插入处3]',zItem);
   if(customName.value !== ''){
    name = customName.value;
    newStory = newStory.replace('李雷',name); 
   }
  }else{
   newStory = englishOfStoryText; 
   xItem = randomValueFromArray(insertX);
   yItem = randomValueFromArray(insertY);
   zItem = randomValueFromArray(insertZ);
   newStory = newStory.replace(':insertx:',xItem);
   newStory = newStory.replace(':insertx:',xItem);
   newStory = newStory.replace(':inserty:',yItem);
   newStory = newStory.replace(':insertz:',zItem);
   if(customName.value !== '') {
    name = customName.value;
    newStory = newStory.replace('bob',name);
   }
  
   if(document.getElementById("uk").checked){
    var weight = Math.round(300 / 14);
    console.log(weight);
    var temperature =  Math.round(5 / 9 * (94 - 32));
    console.log(temperature);
    newStory = newStory.replace('300',weight);
    newStory = newStory.replace('pounds','stone');
    newStory = newStory.replace('94',temperature);
    newStory = newStory.replace('fahrenheit','centigrade');
   }
 }
  story.textContent = newStory;
  story.style.visibility = 'visible';
}

