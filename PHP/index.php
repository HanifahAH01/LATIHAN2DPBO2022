<?php
// import class
include "Memory.php";


$klasifikasi = new Memory(); //buat objek
//set objek
$klasifikasi->setIdProduct(1019);
$klasifikasi->setPrice(1000000);
$klasifikasi->setBrand("Oppo");
$klasifikasi->setModel("A15");
$klasifikasi->setFrequency("3 Ghz");
$klasifikasi->setMemorySize("8 GB");
$klasifikasi->setSupportCuda("9.0");


//output
echo "======= Klasifikasi =======" . "<br>";
echo "Id Product : " . $klasifikasi->getIdProduct() . "<br>";
echo "Price : " . $klasifikasi->getPrice() . "<br>";
echo "Brand	: " . $klasifikasi->getBrand() . "<br>";
echo "Model	: " . $klasifikasi->getModel() . "<br>";
echo "Frequency Memory : " . $klasifikasi->getFrequency() . "<br>";
echo "Memory Size : " . $klasifikasi->getMemorySize() . "<br>";
echo "Support Cuda : " . $klasifikasi->getSupportCuda() . "<br>";
echo "=======================";