<!DOCTYPE html>
<html>
<head>
    <style>
        div {
            display: inline-block;
            width: 150px;
            padding: 2px;
            margin: 5px;
        }
        .container {
            width: 820px;
        }
    </style>
</head>
<body>
<div class="container">
    <?php
    for ($red = 0; $red <= 255; $red += 51) {
        for ($green = 0; $green <= 255; $green += 51) {
            for ($blue = 0; $blue <= 255; $blue += 51) {
                echo "<div style='background:rgb($red, $green, $blue)'>rgb($red, $green, $blue)</div>";
            }
        }
    }
    ?>
</div>
</body>