<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style> 
</head>
<body>
<?php
$rowIndex = 0;
for ($row = 0; $row < 5; $row++) {
    for ($i = $rowIndex; $i < $rowIndex + 50; $i+=5) {
        echo "<div style='background-color: rgb($i, $i, $i)'></div>";
    }
    echo "<br>";
    $rowIndex += 51;
}
?>
</body>
</html>