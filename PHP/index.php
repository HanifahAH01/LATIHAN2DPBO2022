<?php
// import class
include "Memory.php";

// create new Memory class instance

$klasifikasi = new Memory("3 Ghz", "8 GB", "9.0");

// set attribute parent class
$klasifikasi->setIdProduct(1019);
$klasifikasi->setPrice(1000000);
$klasifikasi->setBrand("Oppo");
$klasifikasi->setModel("A15");

// show the class
echo "======= Klasifikasi =======" . "<br>";
echo "Id Product : " . $klasifikasi->getIdProduct() . "<br>";
echo "Price : " . $klasifikasi->getPrice() . "<br>";
echo "Brand	: " . $klasifikasi->getBrand() . "<br>";
echo "Model	: " . $klasifikasi->getModel() . "<br>";
echo "Frequency Memory : " . $klasifikasi->getFrequency() . "<br>";
echo "Memory Size : " . $klasifikasi->getMemorySize() . "<br>";
echo "Support Cuda : " . $klasifikasi->getSupportCuda() . "<br>";
echo "=======================";