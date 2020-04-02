<!DOCTYPE html>
<html lang="en">
<head >
    <meta charset="UTF-8">
    <title>Build a table</title>
    <script>
let lab = [
  { task: "Monte Falco", name: 1658, solution: "Anindo".link("google.com")},
  { task: "Monte Falterona", name: 1654, solution: "Anindo".link("google.com")},
  { task: "Poggio Scali", name: 1520, solution: "Anindo".link("google.com")},
  { task: "Pratomagno", name: 1592, solution: "Anindo".link("google.com")},
  { task: "Monte Amiata", name: 1738, solution: "Anindo".link("google.com")}
];

function generateTableHead(table, data) {
  let thead = table.createTHead();
  let row = thead.insertRow();
  for (let key of data) {
    let th = document.createElement("th");
    let text = document.createTextNode(key);
    th.appendChild(text);
    row.appendChild(th);
  }
}

function generateTable(table, data) {
  for (let element of data) {
    let row = table.insertRow();
    for (key in element) {
      let cell = row.insertCell();
      let text = document.createTextNode(element[key]);
      cell.appendChild(text);
    }
  }
}

let table = document.querySelector("table");
let data = Object.keys(lab[0]);
generateTableHead(table, data);
generateTable(table, lab);
</script>
</head>
<body>
<table>
<!-- here goes our data! -->
</table>
</body>

</html>
