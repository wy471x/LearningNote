var textarea = document.getElementById('code');
var reset = document.getElementById('reset');
var solution = document.getElementById('solution');
var code = textarea.value;

function updateCode() {
  eval(textarea.value);
}

reset.addEventListener('click', function() {
  textarea.value = code;
  updateCode();
});

solution.addEventListener('click', function() {
  textarea.value = jsSolution;
  updateCode();
});

var jsSolution = 'var list = document.querySelector(\'.output ul\');\nlist.innerHTML = \'\';\nvar greetings = [\'Happy Birthday!\',\n                 \'Merry Christmas my love\',\n                 \'A happy Christmas to all the family\',\n                 \'You\\\'re all I want for Christmas\',\n                 \'Get well soon\'];\n\nfor(var i = 0; i < greetings.length; i++) {\n  var input = greetings[i];\n  if(greetings[i].indexOf(\'Christmas\') !== -1) {\n    var result = input;\n    var listItem = document.createElement(\'li\');\n    listItem.textContent = result;\n    list.appendChild(listItem);\n  }\n}';

textarea.addEventListener('input', updateCode);
window.addEventListener('load', updateCode);

