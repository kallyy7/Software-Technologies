<?php
if (isset($_GET['text'])) {
    $text = $_GET['text'];
    $re = '/\w+/';
    preg_match_all($re, $text, $matches);
    $words = $matches[0];
    $upperWords = array_filter($words, function($word){
        return strtoupper($word) == $word;
    });
    echo implode(', ', $upperWords);
}
?>

<form>
    <textarea rows="10" name="text"></textarea> <br>
    <input type="submit" value="Extract">
</form>
