interface BaseRow {
    id: number
    numberOfHours: number
    description: string
}

export interface Row extends BaseRow {
    dateOfWork: Date
}

export interface RowJson extends BaseRow {
    dateOfWork: string
}