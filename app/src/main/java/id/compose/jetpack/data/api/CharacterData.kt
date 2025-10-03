package id.compose.jetpack.data.api

import id.compose.jetpack.data.model.Bio
import id.compose.jetpack.data.model.Character
import id.compose.jetpack.data.model.ChronologicalInformation
import id.compose.jetpack.data.model.PersonalInformation
import id.compose.jetpack.data.model.PhysicalDescription
import id.compose.jetpack.data.model.PoliticalInformation

object CharacterData {
    val characters = listOf(
        Character(
            id = 1,
            name = "Aang",
            image = "https://static.wikia.nocookie.net/avatar/images/a/ae/Aang_at_Jasmine_Dragon.png/revision/latest/scale-to-width-down/333?cb=20130612174003",
            bio = Bio(
                alternativeNames = listOf(
                    "Aangy (by Koko)",
                    "Kuzon (while at the Fire Nation school)",
                    "Twinkle Toes (by Toph)",
                    "Sweetie (by Katara)"
                ),
                nationality = "Southern Air Temple",
                ethnicity = "Air Nomad",
                ages = listOf(
                    "112 (biologically 12) in Avatar: The Last Airbender[3]",
                    "113-114 (biologically 13-14) in The Promise trilogy[4]",
                    "114-115 (biologically 14-15) in The Search and The Rift trilogies[5]",
                    "165 (biologically 66) at death[6]"
                ),
                born = "12 BG",
                died = listOf(
                    "Spring 100 AG (revived by Katara using spirit water)",
                    "153 AG"
                )
            ),
            physicalDescription = PhysicalDescription(
                gender = "Male",
                eyeColor = "Gray",
                hairColor = "Dark brown (typically shaved)",
                skinColor = "Light"
            ),
            personalInformation = PersonalInformation(
                allies = listOf(
                    "Appa",
                    "Katara",
                    "Momo",
                    "Sokka",
                    "Tenzin",
                    "Toph",
                    "Zuko",
                    "King Bumi",
                    "Bumi",
                    "Gyatso",
                    "Hakoda",
                    "Iroh",
                    "Kya",
                    "Suki",
                    "Kuzon",
                    "lion turtle",
                    "all Avatars"
                ),
                enemies = listOf(
                    "Azula",
                    "Ozai",
                    "Zhao",
                    "Zuko (formerly)",
                    "Combustion Man",
                    "Long Feng",
                    "Sozin",
                    "Yakone",
                    "Joo Dee",
                    "the Dai Li"
                ),
                weaponsOfChoice = listOf(
                    "The elements",
                    "glider staff"
                ),
                fightingStyles = listOf(
                    "Airbending",
                    "waterbending (Northern and Southern style)",
                    "earthbending (Chu Gar Praying Mantis Kung Fu)",
                    "firebending (Dancing Dragon)",
                    "energybending"
                )
            ),
            politicalInformation = PoliticalInformation(
                profession = "Air Nomad culture teacher, Airbending instructor, Avatar, Monk",
                position = "Co-founder of the United Republic of Nations, Fully realized Avatar",
                predecessor = "Roku (as the Avatar)",
                successor = "Korra (as the Avatar)",
                affiliations = "Air Acolytes, Air Nomads, Air Scouts (formerly), Team Avatar"
            ),
            chronologicalInformation = ChronologicalInformation(
                firstAppearance = "\"The Boy in the Iceberg\"",
                lastAppearance = listOf(
                    "Imbalance Part Three (chronological)",
                    "\"Darkness Falls\"(as spirit)",
                    "\"Remembrances\"(flashback only)"
                ),
                voicedBy = listOf(
                    "Zach Tyler Eisen (in Avatar: The Last Airbender)",
                    "Mitchel Musso (unaired pilot episode)",
                    "D. B. Sweeney (in The Legend of Korra)"
                )
            )
        ),
        Character(
            id = 2,
            name = "Appa",
            image = "https://static.wikia.nocookie.net/avatar/images/6/65/Appa_flying.png/revision/latest/scale-to-width-down/333?cb=20140517110636",
            bio = Bio(
                alternativeNames = listOf("NA"),
                nationality = "Air Nomad",
                ethnicity = "NA",
                ages = listOf("NA"),
                born = "NA",
                died = listOf("NA")
            ),
            physicalDescription = PhysicalDescription(
                gender = "Male",
                eyeColor = "Brown",
                hairColor = "White and brown",
                skinColor = "Fur"
            ),
            personalInformation = PersonalInformation(
                allies = listOf(
                    "Azula",
                    "Ozai",
                    "Zuko (formerly)",
                    "Combustion Man",
                    "Zhao",
                    "Long Feng",
                    "the Dai Li",
                    "Shuzumu",
                    "circus trainer",
                    "Ghashiun",
                    "Si Wong tribes",
                    "beetle-headed merchants"
                ),
                enemies = listOf(
                    "Air",
                    "body bulk",
                    "tail"
                ),
                weaponsOfChoice = listOf("Airbending"),
                fightingStyles = listOf("NA")
            ),
            politicalInformation = PoliticalInformation(
                profession = "\n",
                position = "NA",
                predecessor = "Naga (as next animal companion of the Avatar)",
                successor = "Air Nomads\nTeam Avatar",
                affiliations = "NA"
            ),
            chronologicalInformation = ChronologicalInformation(
                firstAppearance = "\"The Boy in the Iceberg\"",
                lastAppearance = listOf("Imbalance Part One (chronological)"),
                voicedBy = listOf("NA")
            )
        ),
        Character(
            id = 3,
            name = "Momo",
            image = "https://static.wikia.nocookie.net/avatar/images/8/80/Momo_staring.png/revision/latest/scale-to-width-down/333?cb=20200802080013",
            bio = Bio(
                alternativeNames = listOf("NA"),
                nationality = "Air Nomad",
                ethnicity = "NA",
                ages = listOf("NA"),
                born = "NA",
                died = listOf("NA")
            ),
            physicalDescription = PhysicalDescription(
                gender = "Male",
                eyeColor = "Light green",
                hairColor = "White and brown",
                skinColor = "Fur"
            ),
            personalInformation = PersonalInformation(
                allies = listOf(
                    "Ozai",
                    "Azula",
                    "Zhao",
                    "Zuko (formerly)",
                    "Long Feng",
                    "the Dai Li",
                    "Tom-Tom",
                    "Fire Nation (formerly)",
                    "buzzard wasp",
                    "Hawky",
                    "iguana parrot",
                    "bearded cat"
                ),
                enemies = listOf("NA"),
                weaponsOfChoice = listOf("NA"),
                fightingStyles = listOf("NA")
            ),
            politicalInformation = PoliticalInformation(
                profession = "\n",
                position = "NA",
                predecessor = "Air Nomads\nTeam Avatar",
                successor = "NA",
                affiliations = "NA"
            ),
            chronologicalInformation = ChronologicalInformation(
                firstAppearance = "\"The Southern Air Temple\"",
                lastAppearance = listOf("Imbalance Part Two (chronological)"),
                voicedBy = listOf("NA")
            )
        ),
        Character(
            id = 4,
            name = "Katara",
            image = "https://static.wikia.nocookie.net/avatar/images/7/7a/Katara_smiles_at_coronation.png/revision/latest/scale-to-width-down/333?cb=20150104171449",
            bio = Bio(
                alternativeNames = listOf(
                    "Gran Gran (by her grandchildren)",
                    "Sweetie (by Aang)",
                    "Sugar Queen (by Toph Beifong)",
                    "Sweetness (by Toph Beifong)"
                ),
                nationality = "Southern Water Tribe capital city, Southern Water Tribe",
                ethnicity = "Water Tribe",
                ages = listOf(
                    "14 in Avatar: The Last Airbender[3]",
                    "15-16 in The Promise trilogy[4]",
                    "16-17 in The Search and The Rift trilogies[5]",
                    "85 in Book One: Air of The Legend of Korra[6]",
                    "86 in Book Two: Spirits",
                    "89 in Book Four: Balance[7]"
                ),
                born = "85 AG",
                died = listOf("85 AG")
            ),
            physicalDescription = PhysicalDescription(
                gender = "Female",
                eyeColor = "Blue",
                hairColor = "Dark brown (white in old age)",
                skinColor = "Brown"
            ),
            personalInformation = PersonalInformation(
                allies = listOf(
                    "Yue",
                    "the Painted Lady",
                    "Hakoda",
                    "Kya",
                    "Kanna",
                    "Tenzin",
                    "Bumi",
                    "Kya",
                    "Jinora",
                    "Ikki",
                    "Meelo",
                    "Rohan",
                    "Team Avatar",
                    "Order of the White Lotus",
                    "Air Acolytes",
                    "Hama (formerly)",
                    "Yagoda",
                    "Malina",
                    "Maliq (formerly)",
                    "Korra",
                    "Niyok",
                    "Nutha",
                    "Siku and Sura",
                    "Rafa and Misu",
                    "Ashuna",
                    "Kyoshi Warriors",
                    "Mai",
                    "Tyro"
                ),
                enemies = listOf(
                    "Mother of Faces (formerly)",
                    "Wan Shi Tong",
                    "Old Iron",
                    "Ozai",
                    "Azula",
                    "Zuko (formerly)",
                    "Azula's team (formerly)",
                    "Zhao",
                    "Combustion Man",
                    "Rough Rhinos",
                    "Fire Nation (formerly)",
                    "Long Feng",
                    "the Dai Li",
                    "Azulon",
                    "Yon Rha",
                    "the Southern Raiders",
                    "Hama",
                    "Gilak",
                    "Thod and his disciples",
                    "Southern Water Tribe nationalists",
                    "Maliq and Malina's workers"
                ),
                weaponsOfChoice = listOf("Water"),
                fightingStyles = listOf(
                    "Waterbending (Northern and Southern styles)",
                    "bloodbending (resigned from use)"
                )
            ),
            politicalInformation = PoliticalInformation(
                profession = "\n",
                position = "Daughter of the Southern Water Tribe Head Chieftain, Master healer, Member of the Southern Council of Elders[9], Waterbending master",
                predecessor = "Pakku (as Avatar Aang's waterbending master)",
                successor = "Team Avatar\nWater Tribe\nJiang's pirate crew (honorary member)[10]",
                affiliations = "NA"
            ),
            chronologicalInformation = ChronologicalInformation(
                firstAppearance = "\"The Boy in the Iceberg\"",
                lastAppearance = listOf(
                    "\"Light in the Dark\"(chronological)",
                    "\"Remembrances\"(flashback only)"
                ),
                voicedBy = listOf(
                    "Mae Whitman (in Avatar: The Last Airbender)",
                    "Eva Marie Saint (in The Legend of Korra)"
                )
            )
        ),
        Character(
            id = 5,
            name = "Sokka",
            image = "https://static.wikia.nocookie.net/avatar/images/c/cc/Sokka.png/revision/latest/scale-to-width-down/333?cb=20140905085428",
            bio = Bio(
                alternativeNames = listOf(
                    "Wang Fire (while in the Fire Nation)",
                    "Captain Boomerang (by Toph Beifong)"
                ),
                nationality = "Southern Water Tribe capital city, Southern Water Tribe",
                ethnicity = "Water Tribe",
                ages = listOf(
                    "15 in Avatar: The Last Airbender[3]",
                    "16-17 in The Promise trilogy[4]",
                    "17-18 in The Search and The Rift trilogies[5]",
                    "44 in The Legend of Korra (flashback to Yakone's trial)"
                ),
                born = "84 AG",
                died = listOf("84 AG")
            ),
            physicalDescription = PhysicalDescription(
                gender = "Male",
                eyeColor = "Blue",
                hairColor = "Dark brown (shaved on the sides)",
                skinColor = "Brown"
            ),
            personalInformation = PersonalInformation(
                allies = listOf(
                    "Hakoda",
                    "Kya",
                    "Kanna",
                    "Katara",
                    "Pakku",
                    "Aang",
                    "Toph",
                    "Zuko",
                    "Suki",
                    "Appa",
                    "Momo",
                    "Hawky",
                    "Piandao",
                    "Yue",
                    "Order of the White Lotus",
                    "Southern Water Tribe",
                    "United Republic Council",
                    "Tonraq",
                    "Tenzin",
                    "Korra"
                ),
                enemies = listOf(
                    "Ozai",
                    "Azula",
                    "Zhao",
                    "Long Feng",
                    "Dai Li",
                    "Combustion Man",
                    "Southern Raiders",
                    "Azulon",
                    "Zuko (formerly)",
                    "Yon Rha",
                    "Hahn",
                    "Hama",
                    "Kunyo",
                    "Yakone",
                    "Fire Nation (formerly)",
                    "Red Lotus"
                ),
                weaponsOfChoice = listOf(
                    "Sokka's weapons (Jian",
                    "boomerang",
                    "club",
                    "machete",
                    "dagger",
                    "saber)"
                ),
                fightingStyles = listOf(
                    "Water Tribe Warrior style",
                    "tessenjutsu (basics)",
                    "swordsmanship (Jian-fencing)"
                )
            ),
            politicalInformation = PoliticalInformation(
                profession = "\n",
                position = "Chieftain in the Southern Water Tribe (formerly), Map reader, Son of Head Chieftain Hakoda, Southern Water Tribe representative and Chairman of the United Republic Council (formerly)",
                predecessor = "Bendless Boomerang Club[7]\nSouthern Water Tribe\nTeam Avatar\nFire Nation Army[8] (formerly)\nUnited Republic Council",
                successor = "NA",
                affiliations = "NA"
            ),
            chronologicalInformation = ChronologicalInformation(
                firstAppearance = "\"The Boy in the Iceberg\"",
                lastAppearance = listOf(
                    "Imbalance Part Three (chronological)",
                    "\"Out of the Past\"(vision)"
                ),
                voicedBy = listOf(
                    "Jack DeSena (in Avatar: The Last Airbender)",
                    "Chris Hardwick (in The Legend of Korra)"
                )
            )
        )
    )
}