<?php
function celsiusToFahrenheit(float $cel) : float {
    return $cel * 1.8 + 32;
}
function fahrenheitToCelsius(float $fah) : float{
    return ($fah - 32) / 1.8;
}
if (isset($_GET['cel'])) {
    $cel = floatval($_GET['cel']);
    $fah = celsiusToFahrenheit($cel);
    $msgAfterCelsius = "$cel &deg;C = $fah &deg;F";
}
if (isset($_GET['fah'])) {
    $fah = floatval($_GET['fah']);
    $cel = fahrenheitToCelsius($fah);
    $msgAfterFahrenheit = "$fah &deg;F = $cel &deg;C";
}
?>

<form>
    Celsius: <input type="text" name="cel" />
    <input type="submit" value="Convert">
    <?= $msgAfterCelsius ?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah" />
    <input type="submit" value="Convert">
    <?= $msgAfterFahrenheit ?>
</form>