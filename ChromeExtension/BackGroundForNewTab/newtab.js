function randomImg(){
  var numImages=235;
  var randomNumber = Math.floor(Math.random() * numImages)+1;
  var imgName = randomNumber + ".jpg";
  console.log(imgName);
  return imgName;
}
document.body.background = 'images/'+randomImg();