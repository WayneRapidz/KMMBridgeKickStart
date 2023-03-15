// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/WayneRapidz/KMMBridgeKickStart/io/rapidz/kmmbridgekickstart/allshared-kmmbridge/0.2.9/allshared-kmmbridge-0.2.9.zip"
let remoteKotlinChecksum = "b3b21e8b0e6d05bd576699c368af84a38d297a4178bc8d0b04d338d0396c02e1"
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