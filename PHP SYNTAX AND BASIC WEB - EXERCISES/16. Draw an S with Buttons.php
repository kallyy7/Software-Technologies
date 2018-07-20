<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
for ($col = 0; $col < 9; $col++) {
    if ($col == 0 || $col == 4 || $col == 8) {
        for ($row = 0; $row < 5; $row++) {
            echo "<button style='background-color: blue'>1</button>";
        }
        echo "<br>";
    } elseif ($col > 0 && $col < 4) {
        echo "<button style='background-color: blue'>1</button>";
        for ($row = 0; $row < 4; $row++) {
            echo "<button>0</button>";
        }
        echo "<br>";
    } elseif ($col > 4 && $col < 8) {
        for ($row = 0; $row < 4; $row++) {
            echo "<button>0</button>";
        }
        echo "<button style='background-color: blue'>1</button>";
        echo "<br>";
    }
}
?>
</body>
</html>