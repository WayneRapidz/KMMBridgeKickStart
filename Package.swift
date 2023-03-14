// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/WayneRapidz/KMMBridgeKickStart/io/rapidz/kmmbridgekickstart/allshared-kmmbridge/0.2.0.1/allshared-kmmbridge-0.2.0.1.zip"
let remoteKotlinChecksum = "8bfbdfa46dd3b06652088c28294cdcbc58f0f968e5d5658a943b2dcdb67ff9a8"
let packageName = "allshared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)